#O que são os operadores no Python?

#Adição
answer = 30 +12
print(answer)

#Subtração
difference = 30 - 12
print(difference)

#Multiplicação
product = 30 * 12
print(product)


#Divisão
quotient = 30 / 12
print(quotient)

#Trabalhar com divisão

seconds = 1042
display_minutes = 1042 // 60
display_seconds = 1042 % 60
print(display_minutes)
print(display_seconds)


#Ordem de operação

"""
Parênteses
Exponentes
Multiplicação e divisão
Adição e subtraçã
"""

result_1 = 1032 + 26*2
result_2 = 1032 + (26*2)
print(result_1, result_2)


#Converter cadeias de caracteres em números
demo_int = int('215')
print(demo_int)

demo_float = float('215.3')
print(demo_float)


#Valores absolutos
print(abs(39 - 16))
print(abs(16 - 39))

#Arredondamento
print(round(15.5))


#Biblioteca de matemática
from math import ceil, floor

round_up = ceil(12.5)
print(round_up)

round_down = floor(12.5)
print(round_down)



