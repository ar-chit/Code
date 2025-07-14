class bitwise {
    public static void main(String args[]){
        int a = 5;
        String b = Integer.toBinaryString(a);
        int k = 1;
        for (int i = 1; i < k; i++) {
            b = b / 10;
        }
        if(b % 10 == 0){
            System.out.println("Not set");
        }
        else{
            System.out.println("Set");
        }
    }

}
