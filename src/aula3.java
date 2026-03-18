    void main(){

        int y = 32;
        double x = 10.35784;
        String nome = "Flora";
        int age = 22;
        double salary = 2000.0;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x); // resultado com vírgula
        Locale.setDefault(Locale.US); // separa com ponto
        System.out.printf("%.4f%n", x); // resultado com ponto
        System.out.print("Bom Dia! "); // sem quebra de linha
        System.out.println("Hello, World!"); // com quebra de linha
        System.out.printf("%s tem %d anos de idade e ganha %.2f reais.", nome, age, salary);
    }
