
class Net {

    private double n = 0.1;
    private int training[][] =new int[5][];
    private Neuron neurons[]=new Neuron[5];

    Net(int noOfNeurons,int trainingdata[][]){
        neurons=new Neuron[noOfNeurons];
        for(int j=0;j<neurons.length;j++){
            neurons[j]=new Neuron();
        }
        training=trainingdata;
    }

    void training(){
        for(int i=0;i<training.length;i++){
            int inputs[]= training[i];
            double output=getNeuralNetOutput(neurons,inputs);
            //uaktualnij wszystkie neurony
            for(int j=0;j<neurons.length;j++){

                neurons[j].updateWeight(output* n *inputs[j]);
            }
        }
    }

    private double getNeuralNetOutput(Neuron[] neurons, int inputs[]){
        //dodaj wszystkie wyjscia
        double output=0;
        for(int j=0;j<neurons.length;j++){
            output+=neurons[j].getOutput(inputs[j]);
        }
        return output;
    }

    void testing(int[] inputs){
        System.out.println(getNeuralNetOutput(neurons,inputs));
    }


}
