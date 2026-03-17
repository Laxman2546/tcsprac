public class Repeatingstring {
    public static void main(String[] args) {
        String s = "aabaa";
        int maxCurtains = 0;
        int count = 0;
        int  l = 4;
        for(int i=0;i<s.length();i++){
            if(i % l== 0){
                maxCurtains = Math.max(maxCurtains,count);
                count = 0;
            }
            if(s.charAt(i) == 'a'){
                count++;
                maxCurtains = Math.max(maxCurtains,count);
            }
        }
        maxCurtains = Math.max(maxCurtains,count);
        System.out.println(maxCurtains);
    }

}
