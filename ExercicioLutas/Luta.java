package exerciciolutador;
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2, int rounds){
        if(l1.getCategoria().equals(l2.getCategoria())){
            if(l1 != l2){
                this.setAprovada(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2);
                this.setRounds(rounds);
                System.out.println(this.getDesafiado().getNome() + " x " + this.getDesafiante().getNome() + " marcada!\n");
            }
            else{
                this.setAprovada(false);
                this.setDesafiado(null);
                this.setDesafiante(null);
                System.out.println("Erro, desafiado e desafiante são a mesma pessoa.");
            }
        }
        else{
                this.setAprovada(false);
                this.setDesafiado(null);
                this.setDesafiante(null);
            System.out.println("Erro, categorias dos lutadores são diferentes.");
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
            this.getDesafiado().apresentar();
            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
            System.out.println("");
            this.getDesafiante().apresentar();
            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
            
            System.out.println("\nE que comece a luta!");
            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
            
            String f;
            int x = 0;
            
            for(int i = 1; i <= this.getRounds(); i++){
                System.out.println("Round " + i + "!");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                int vencedor = (int) (Math.random() * 21);
                if(vencedor < 2){
                    f = (vencedor % 2 == 0 ? "submissão!" : "nocaute!");
                    System.out.println("\nDesafiado " + this.desafiado.getNome() + " venceu por " + f);
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    x = 1;
                    break;
                }else if(vencedor < 4){
                    f = (vencedor % 2 == 0 ? "submissão!" : "nocaute!");
                    System.out.println("\nDesafiante " + this.desafiante.getNome() + " venceu por " + f);
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    x = 1;
                    break;
                }
            }
            
            if(x == 0){
                System.out.print("A luta acabou! O vencedor por pontos é...");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
            
                int vencedor = (int) (Math.random() * 2);
            
                switch(vencedor){
                    case 0:
                        System.out.println(this.desafiado.getNome() + "!");
                        this.getDesafiado().ganharLuta();
                        this.getDesafiante().perderLuta();
                        break;
                    case 1:
                        System.out.println(this.desafiante.getNome() + "!");
                        this.getDesafiante().ganharLuta();
                        this.getDesafiado().perderLuta();
                        break;
                }
            }
            
            System.out.println("\nStatus dos lutadores atualizados!");
            this.getDesafiado().status();
            this.getDesafiante().status();
        }
        else{
            System.out.println("Luta não está aprovada.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
