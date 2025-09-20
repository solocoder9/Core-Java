# Primitive Data Types

| Type    | Description          | Default | Size    | Example Literals                          | Range of Values                                           |
|---------|----------------------|---------|---------|-------------------------------------------|-----------------------------------------------------------|
| boolean | true or false        | false   | 1 bit   | `true`, `false`                           | `true`, `false`                                          |
| byte    | 2's complement int   | 0       | 1 byte  | *(none)*                                  | -128 to 127                                               |
| char    | Unicode character    | `\u0000`| 2 bytes | `'a'`, `'\u0041'`, `'\101'`, `'\\'`, `'\n'`, `'β'` | 0 to 65,535 (Unicode values)                     |
| short   | 2's complement int   | 0       | 2 bytes | `-2`, `-1`, `0`, `1`, `2`                 | -32,768 to 32,767                                         |
| int     | 2's complement int   | 0       | 4 bytes | `-2`, `-1`, `0`, `1`, `2`                 | -2,147,483,648 to 2,147,483,647                           |
| long    | 2's complement int   | 0       | 8 bytes | `-2L`, `-1L`, `0L`, `1L`, `2L`            | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807   |
| float   | IEEE 754 floating pt | 0.0     | 4 bytes | `1.23e100f`, `-1.23e-100f`, `.3f`, `3.14F`| Up to 7 decimal digits                                    |
| double  | IEEE 754 floating pt | 0.0     | 8 bytes | `1.23456e300d`, `-123456e-300d`, `1e1d`   | Up to 16 decimal digits                                   |
