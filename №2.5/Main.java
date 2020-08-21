public class Main {
    public static void main(String[] args) {
        String[] wds = new String[]{"Мама", "Мыла", "Раму"};
        int len = wds.length;
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                for (int k = 0; k < len; k++){
                    if ((i!=j)&&(j!=k)&&(i!=k)) System.out.println(wds[i] + wds[j] + wds[k]);
                }
            }
        }
    }
}
