import data.DataReader;
import genetic.Chromosome;
import genetic.Genetic;

public class TestMain {

    public static void main(String[] args) {

        DataReader data = new DataReader();

        Genetic g = new Genetic();
        Chromosome x = g.geneticAlgorithm(100, 0.05, 150, 1000, data);
        x.print();
        System.out.println(x.getFitness() );

    }



}
