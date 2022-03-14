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
        //System.out.println(deRun.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A"));

        Encryptor deRun2 = new Encryptor(5, 5);
        //System.out.println(deRun2.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA"));

        Encryptor deRun3 = new Encryptor(6, 5);
        //System.out.println(deRun3.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA"));

        Encryptor deRun4 = new Encryptor(9, 8);
        //System.out.println(deRun4.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA"));

        Encryptor message = new Encryptor(5, 3);
        //System.out.println(message.encryptMessage("Hope you have an eggstra good day!"));

        Encryptor recieve = new Encryptor(2, 6);
        System.out.println(recieve.decryptMessage("Wtsih  faile?i   filLesif  geaEl,nniswdhho a rtt nerc  aabtnst  letoadoth naelggrauesAAA.AAAAAAA"));
    }
}
