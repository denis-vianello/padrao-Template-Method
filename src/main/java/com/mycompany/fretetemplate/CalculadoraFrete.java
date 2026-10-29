/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fretetemplate;

/**
 *
 * @author PICHAU
 */
public abstract class CalculadoraFrete {

    public double calcularFrete(double peso) {
        validarPeso(peso);
        return peso * obterValorPorQuilo();
    }

    protected abstract double obterValorPorQuilo();

    private void validarPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
    }
}
