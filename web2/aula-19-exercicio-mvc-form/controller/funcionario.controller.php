<!DOCTYPE html>
<html lang="pt-br" dir="ltr">

<head>
    <title>Exercício 19 - Modelo MVC</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Yasmin L">
    <meta name="description" content="Exercício 19 - Modelo MVC - Se adaptando ao modelo.">
    <meta name="keywords" content="PHP, HTML, Model, View, Controller">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>
    <main class="container-fluid">
        <div class="container">
            <div class="row p-1">
                <nav class="mx-auto" aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="../index.php">Exercícios</a></li>
                        <li class="breadcrumb-item"><a href="../view/cadastrafuncionario.php">Cadastro Funcionário</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Resposta</li>
                    </ol>
                </nav>
            </div>
            <div class="row p-5 card">
                <div class="mx-auto">
                    <h2>Exercício 1</h2>
                    <p>Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que receba , por exemplo, o salário fixo de 5400.40, e o valor de suas vendas de 15000.20. Calcule e mostre a comissão e o salário final do funcionário.</p>
                    <div class="card">
                        <div class="card-body">
                            <?php
                            include "../model/funcionario.model.php";

                            $funcionario1 = new Funcionario($_GET['txtsalariofixo'], $_GET['txtvendas']);

                            echo $funcionario1->toString() . "</p><p>
                            Comissão: R$ " . round($funcionario1->calcularComissao(), 2) . "</p><p>
                            Salário Final: R$ " . round($funcionario1->calcularSalarioFinal(), 2) . "</p>";
                            ?>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
</body>

</html>