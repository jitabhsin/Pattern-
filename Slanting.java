class Slanting {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        
    }

        
    }
}    
