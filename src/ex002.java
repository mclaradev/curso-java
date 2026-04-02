void main(){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double delta = b * b - 4 * a * c;
    if(a == 0 || delta < 0){
        System.out.println("Impossível Calcular.");
    }
    else {
        double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.printf("R1: %.5f%nR2: %.5f%n", r1, r2);
    }

    sc.close();
}
