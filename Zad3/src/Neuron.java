
class Neuron{
    double w;

    Neuron(){
        w=1;
    }

    public double getOutput(int x){
        return x*w;
    }

    public void updateWeight(double update){
        w+=update;
    }
}
