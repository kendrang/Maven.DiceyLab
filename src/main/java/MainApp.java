public class MainApp {
    public static void main (String[] args){
        Simulation simulation = new Simulation(2, 1000);
        simulation.runSimulation();
        simulation.printResult();

    }
}
