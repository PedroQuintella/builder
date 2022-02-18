public class ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public Computador build() {
        if (computador.getFonte().equals("")) {
            throw new IllegalArgumentException("A Fonte é obrigatória.");
        }
        if (computador.getPlacaMae().equals("")) {
            throw new IllegalArgumentException("A Placa-Mãe é obrigatória.");
        }
        if (computador.getMemoriaRam().equals("")) {
            throw new IllegalArgumentException("A Memória Ram é obrigatória.");
        }
        if (computador.getHd().equals("")) {
            throw new IllegalArgumentException("O HD é obrigatório.");
        }
        if (computador.getProcessador().equals("")) {
            throw new IllegalArgumentException("O Processador é obrigatório.");
        }
        return computador;
    }

    public ComputadorBuilder setFonte(String fonte) {
        computador.setFonte(fonte);
        return this;
    }

    public ComputadorBuilder setPlacaMae(String placaMae) {
        computador.setPlacaMae(placaMae);
        return this;
    }

    public ComputadorBuilder setProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder setMemoriaRam(String memoriaRam) {
        computador.setMemoriaRam(memoriaRam);
        return this;
    }

    public ComputadorBuilder setHd(String hd) {
        computador.setHd(hd);
        return this;
    }

    public ComputadorBuilder setPlacaVideo(String placaVideo) {
        computador.setPlacaVideo(placaVideo);
        return this;
    }
}
