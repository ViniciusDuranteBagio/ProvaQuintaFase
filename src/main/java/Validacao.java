class Validacao {
    public static double validarValor(double valor, String tipo) {
        if (valor < 0) {
            System.out.println("Valor inválido para " + tipo + ". Definindo como 0.");
            return 0;
        }
        return valor;
    }

    public static int validarValor(int valor, String tipo) {
        if (valor < 0) {
            System.out.println("Valor inválido para " + tipo + ". Definindo como 0.");
            return 0;
        }
        return valor;
    }
}