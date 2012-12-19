package ir.hit.edu.ltp.dic;

import ir.hit.edu.ltp.util.FullCharConverter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import gnu.trove.*;

public class SegDic
{
	THashSet wordDic;

	public SegDic(THashSet wordDic)
	{
		this.wordDic = wordDic;
	}

	public SegDic()
	{
		this.wordDic = new THashSet();
	}

	/**
	 * load SEG dictionary
	 * the dictionary format is one word in each line
	 * 
	 * @param dicFile
	 * @throws IOException
	 */
	public void loadSegDic(String dicFile) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dicFile), "UTF-8"));
		String word;
		while ((word = br.readLine()) != null)
		{
			word = word.trim();
			if (word.equals(""))
				continue;

			//change half-width characters to full-width characters
			word = FullCharConverter.half2Fullchange(word);
			wordDic.add(word);
		}
	}

	public int size()
	{
		return wordDic.size();
	}

	public boolean containsKey(String str)
	{
		return wordDic.contains(str);
	}
}
