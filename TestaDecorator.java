public class TestaDecorator {
    public static void main(String[] args) {
        // Criando um Açaí simples
        Adicional acaiSimples = new Acai(Tamanho.PEQUENO);
        System.out.println(acaiSimples.getDescricao() + " - R$ " + acaiSimples.custo());

        // Adicionando Morango ao Açaí
        Adicional acaiComMorango = new Morango(acaiSimples);
        System.out.println(acaiComMorango.getDescricao() + " - R$ " + acaiComMorango.custo());

        // Adicionando Morango, Leite Condensado e Banana ao Açaí
        Adicional acaiComComplementos = new Banana(new LeiteCondensado(acaiComMorango));
        System.out.println(acaiComComplementos.getDescricao() + " - R$ " + acaiComComplementos.custo());
        
        // Teste com tamanho grande
        Adicional acaiGrande = new Acai(Tamanho.GRANDE);
        Adicional acaiComDiversos = new Morango(new LeiteCondensado(new Banana(acaiGrande)));
        System.out.println(acaiComDiversos.getDescricao() + " - R$ " + acaiComDiversos.custo());
    }
}
