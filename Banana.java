public class Banana extends BaseDecorator {
    
    public Banana(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo() {
        switch (((Acai) wrappee).getTamanho()) {
            case PEQUENO:
                return wrappee.custo() + 1.00;
            case MEDIO:
                return wrappee.custo() + 1.50;
            case GRANDE:
                return wrappee.custo() + 2.00;
            default:
                return wrappee.custo();
        }
    }
}