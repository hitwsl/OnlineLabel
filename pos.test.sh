nohup java -Xms10G -Xmx20G -cp OnlineLabel.jar ir.hit.edu.ltp.parser.OnlinePos -test -model ./model/conll06.pos.model  -dicFile ./data/pos/conll06.pos.dic -testFile  ./data/pos/test.conll06.seg  -result ./data/pos/test.conll06.result &