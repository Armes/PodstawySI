
public class neuralnet{
    public static void main(String a[]){
        //dane testowe
        int training[][] =new int[][]{{1,1,0,0,1},
                {1,1,0,0,1},
                {1,1,1,0,0},
                {1,1,0,0,1},
                {1,1,0,0,1},
                {1,1,1,0,0},
                {1,1,1,1,1}};
        Net net = new Net(5,training);
        net.training();
        net.testing(new int[]{1,1,0,0,0});
        net.testing(new int[]{0,0,1,0,0});
    }
}
