public class Main {
    public static void main(String[] args) {
            Worker[] worker = new Worker[100];

            int workerCount = 0;


            // Workers
            worker[workerCount++] = new Worker("Carol", 4230.00, 500.00);

            double globalTotalSalary = 0.0;

            System.out.println("EMPLOYEE SALARY REPORT");

            // Loop through the populated space
            for (int i = 0; i < workerCount; i++) {
                Worker w =  worker[i];
                double individualTotal = w.getTotalSalary();
                globalTotalSalary += individualTotal;

                System.out.println(
                        "Name: " + w.getName() +
                                " | Base: " + w.getBaseSalary() +
                                " | Complement: " + w.getComplement() +
                                " | Total: " + individualTotal
                );

            }
            System.out.println("");
            System.out.println("Global Total salary: $" + globalTotalSalary);

    }
}