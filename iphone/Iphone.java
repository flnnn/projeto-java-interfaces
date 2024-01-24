package iphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        System.out.println("*Tocando música no Iphone*");
    }

    public void pausar() {
        System.out.println("*Música pausada no Iphone*");
    }

    public void selecionarMusica() {
        System.out.println("*Selecionando música no Iphone*");
    }

    public void ligar() {
        System.out.println("*Fazendo ligação com Iphone*");
    }

    public void atender() {
        System.out.println("*Atendendo ligação com Iphone*");
    }

    public void iniciarCorreioVoz() {
        System.out.println("*Iniciando correio de voz no Iphone*");
    }

    public void exibirPagina() {
        System.out.println("*Exibindo página web no Iphone*");
    }

    public void adicionarNovaAba() {
        System.out.println("*Adicionando nova aba no navegador do Iphone*");
    }

    public void atualizarPagina() {
        System.out.println("*Atualizando página web no Iphone*");
    }
}
