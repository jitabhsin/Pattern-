
class Revpyramid2 {
    public static void main(String[] args) {
        int n=5;
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row*2-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
