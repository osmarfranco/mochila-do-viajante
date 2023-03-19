public class DIO {
    public String calcularImposto(double renda){
        double imposto = 0.0;

        if(renda < 2000.00){
            return "Isento";
        }

        if(renda > 2000.01 && renda <= 3000.00){
            imposto = (renda - 2000.00) * 0.08;
        } else if (renda > 2000.01 && renda > 3000.00){
            imposto = imposto + (1000.00 * 0.08);
        }

        if(renda > 3000.01 && renda <= 4500.00){
            imposto = (renda - 3000.00) * 0.18;
        } else if (renda > 3000.01 && renda > 4500.00) {
            imposto = imposto + (1500.00 * 0.18);
        }

        if(renda > 4500.00){
            imposto = imposto + ((renda - 4500.00) * 0.28);
        }

        return "R$ " + String.format("%,.2f", imposto);
    }
}
