# Currency Converter (RUB‑based)
Simple Java library for converting coins between currencies based on RUB exchange rates.
## Overview
This package provides:
- ConvertRUB;
- Currency.
## Usage
1. **Add the package to your project**

Include the `org.example.convert` package in your Java project.

2. **Example: Convert RUB to USD**
```java
double amountInDollars = ConvertRUB.convert(1000, Currency.RUB, Currency.DOLLAR);
System.out.println(amountInDollars); // ~11.11 (1000RUB → 11.11USD)
```

## API Reference
### class `ConvertRUB`
#### Static method:
```java
public static double convert(double coin, Currency from, Currency to)
```

#### Parameters:
- `coin` — amount in the source currency;
- `from` — source `Currency` enum value;
- `to` — target `Currency` enum value.

#### Returns:
- Converted amount in the target currency (as double).

#### Logic:
1. Converts the input amount to RUB: `coin × from.getRate()`;
2. Converts RUB to the target currency: `rubles / to.getRate()`.

### enum `Currency`
#### Supported currencies:
- `RUB` — Russian Ruble (rate: 1);
- `DOLLAR` — US Dollar (rate: 90RUB per 1USD).

Each currency has a fixed exchange rate relative to RUB (set in the enum constructor).
#### Configuration
Exchange rates are hardcoded in the Currency enum. To update rates:
1. Modify the rate values in the enum declarations;
2. Recompile the package.

Example:
```java
DOLLAR(95), // Updated rate: 95RUB per 1USD
```
## License
This project is unlicensed. Use at your own risk ;)