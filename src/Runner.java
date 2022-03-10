import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        /*
        Encryptor run = new Encryptor(3, 4);
        System.out.println(run.encryptMessage("What are you doing next weekend?"));

        Encryptor run2 = new Encryptor(6, 5);
        System.out.println(run2.encryptMessage("This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again."));
        System.out.println(run2.decryptMessage("Toi tghnmwr ieeayts  sio tI n dhtaeaoaanlc nndlkadd  w s fbarnno .dddns s e hI ldmotaa ye h nraauI'ytir t  ntw ta.!othgA"));

         */

        Encryptor deRun = new Encryptor(3, 2);
        System.out.println(deRun.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A"));

        Encryptor deRun2 = new Encryptor(5, 5);
        System.out.println(deRun2.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA"));

        Encryptor deRun3 = new Encryptor(6, 5);
        System.out.println(deRun3.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA"));

        Encryptor deRun4 = new Encryptor(9, 8);
        System.out.println(deRun4.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl "));

    }
}
