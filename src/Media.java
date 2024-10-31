/**
 * @author Evandro Santos
 */

public class Media {
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) { // Corrigido para receber float
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public String calculaMedia() {
        float media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;

        if (media >= 7) {
            return media + " Aprovado";
        } else if (media >= 5) {
            return  media + " Recuperação";
        }else {
            return media + " Reprovado";
        }
    }
}

