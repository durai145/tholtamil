public class Binary {
    public static String print(int inp){
        int s=0x8000;
        StringBuffer outputSb=new StringBuffer();

        //System.out.println("s="+s);
        for (int i = 0; i < 8*2; i++) {
            if ((s&inp)==0){
                outputSb.append("0");
            }
            else{
                outputSb.append("1");
            }

            //System.out.println("i="+i + ", s="+s + ", outputSb="+outputSb.toString());
            s=s>>1;
        }

        return outputSb.toString();
    }
}

