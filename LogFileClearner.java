public class LogFileClearner {
    public static void cleanLog(int[] log){
        int index=0;
        for(int i=0;i<log.length;i++){
            if(log[i]!=0){
                log[index]=log[i];
                index++;
            }
        }
        while(index<log.length){
            log[index]=0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] logs = {0, 200, 404, 0, 500, 0, 302};
        cleanLog(logs);

        for (int log : logs) {
            System.out.print(log + " ");
        }
    }
}
