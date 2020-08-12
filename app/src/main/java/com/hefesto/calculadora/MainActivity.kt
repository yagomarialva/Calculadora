package com.hefesto.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adicionados os números que aparecem na tela
        tvOne.setOnClickListener { appendOnExpresstion(string = "1", canClear = true) }
        tvTwo.setOnClickListener { appendOnExpresstion(string = "2", canClear = true) }
        tvThree.setOnClickListener { appendOnExpresstion(string = "3", canClear = true) }
        tvFour.setOnClickListener { appendOnExpresstion(string = "4", canClear = true) }
        tvFive.setOnClickListener { appendOnExpresstion(string = "5", canClear = true) }
        tvSix.setOnClickListener { appendOnExpresstion(string = "6", canClear = true) }
        tvSeven.setOnClickListener { appendOnExpresstion(string = "7", canClear = true) }
        tvEight.setOnClickListener { appendOnExpresstion(string = "8", canClear = true) }
        tvNine.setOnClickListener { appendOnExpresstion(string = "9", canClear = true) }
        tvZero.setOnClickListener { appendOnExpresstion(string = "0", canClear = true) }
        tvDot.setOnClickListener { appendOnExpresstion(string = ".", canClear = true) }

        //Operações a serem realizadas
        tvPlus.setOnClickListener { appendOnExpresstion("+", false) }
        tvMinus.setOnClickListener { appendOnExpresstion("-", false) }
        tvProd.setOnClickListener { appendOnExpresstion("*", false) }
        tvDiv.setOnClickListener { appendOnExpresstion("/", false) }
        tvOpen.setOnClickListener { appendOnExpresstion("(", false) }
        tvClose.setOnClickListener { appendOnExpresstion(")", false) }

        //botao para limpar
        tvClear.setOnClickListener {
            tvExpression.text = ""
            tvResult.text = ""
        }

//funcao para calcular os numeros inseridos pela calculadora
        tvEquals.setOnClickListener {
            try {

                val expression = ExpressionBuilder(tvExpression.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()
                if (result == longResult.toDouble())
                    tvResult.text = longResult.toString()
                else
                    tvResult.text = result.toString()

            } catch (e: Exception) {
                Log.d("Exception", " message : " + e.message)
            }
        }


        //para limpar somente o ultimo numero
        tvBack.setOnClickListener {
            val string = tvExpression.text.toString()
            if (string.isNotEmpty()) {
                tvExpression.text = string.substring(0, string.length - 1)
            }
            tvResult.text = ""
        }
    }
//funcao para realizar as operacoes
    fun appendOnExpresstion(string: String, canClear: Boolean) {
//apos verificar o string, e um booleano para verificar se é possivel limpar o numero, ou seja, se há um numero para ser realizado
        if (tvResult.text.isNotEmpty()) {
            tvExpression.text = ""
        }

        if (canClear) {
            tvResult.text = ""
            tvExpression.append(string)
        } else {
            tvExpression.append(tvResult.text)
            tvExpression.append(string)
            tvResult.text = ""
        }
    }

}