package exerciciolutador;

public class ExercicioLutador {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Kye Illumina", "Canadá", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutador("Real Benex", "Alemanha", 29, 1.68f, 57.8f, 14, 2, 3);
        
        l[2] = new Lutador("Couri", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        l[3] = new Lutador("Dream", "EUA", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Lutador("Cscuile", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        l[5] = new Lutador("Funderful", "Austrália", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta luta1 = new Luta();
        
        luta1.marcarLuta(l[2], l[3], 10);
        
        luta1.lutar();
    }
}
