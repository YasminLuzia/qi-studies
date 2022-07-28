import 'package:flutter/material.dart';
import 'package:ofertas_magalu/models/product.dart';
import 'package:ofertas_magalu/provider/products.dart';

class Home extends StatefulWidget {
  @override
  createState() => _HomeState();
}

class _HomeState extends State<Home> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Ofertas do dia"),
        leading:Image.asset("assets/logo.jpg"),
        bottom: PreferredSize(child: Image.asset("assets/linha.jpg"), preferredSize: Size(0, 0))
      ),
      body: ListView.builder(
        scrollDirection: Axis.vertical,
        itemBuilder: (BuildContext context, int index) {
          Product product = products.elementAt(index);
          return Padding(
            padding: const EdgeInsets.symmetric(
              vertical: 5
            ),
            child: ListTile(
              trailing: IconButton(
                onPressed: () {
                  setState(() {
                    product.isFavorite = !product.isFavorite;
                  });
                }, 
                color: Colors.red,
                icon: (product.isFavorite)
                ? Icon(Icons.favorite)
                : Icon(Icons.favorite_outline)
              ),
              title: Row(
                children: [
                  ClipRect(
                    child: Image.asset(
                      product.picture,
                      width: 80,
                      height: 80,
                    ),
                  ),
                  Expanded( child: 
                    Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                        Text(
                          product.name,
                          style: TextStyle(
                            fontSize: 12,
                            fontWeight: FontWeight.bold
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.symmetric(
                            vertical: 2
                          ),
                          child: Text(
                            product.details,
                            style: TextStyle(
                              fontSize: 10
                            ),
                          ),
                        ),
                        Text(
                          "R\$ ${product.price.toStringAsFixed(2)}",
                          style: TextStyle(
                            fontSize: 12,
                            fontWeight: FontWeight.bold,
                            color: Colors.blue
                          ),
                        ),
                        Text(
                          "${product.tranche}x de R\$ ${product.calculateTranche(product.tranche, product.price)} sem juros",
                          style: TextStyle(
                            fontSize: 10,
                            color: Colors.blue
                          ),
                        ),
                      ],
                    ),
                  ),
                ]
              ),
            ),
          );
        },
        itemCount: products.length,
      ),
      backgroundColor: Colors.white,
    );
  }
}