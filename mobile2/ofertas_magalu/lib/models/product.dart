class Product {
  final String picture;
  final String name;
  final String details;
  final double price;
  final int tranche;
  bool isFavorite;

  Product({
    required this.picture,
    required this.name,
    required this.details,
    required this.price,
    required this.tranche,
    this.isFavorite = false,
  });

  calculateTranche(int tranch, double price) {
    return (price/tranche).toStringAsFixed(2);
  }
}
