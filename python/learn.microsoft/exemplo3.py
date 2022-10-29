"""criar um programa que pode calcular a distância entre dois planetas. 
Começaremos usando duas distâncias planetárias: Terra (149.597.870 km) 
e Júpiter (778.547.200 km)."""


#Crie variáveis para armazenar as distâncias
first_planet = 149597870
second_planet = 778547200

#Exibir distância entre planetas
distance_km = second_planet - first_planet
print(f'distance kilometers {distance_km}')

distance_mi = distance_km / 1.609344
print(f'distance miles {distance_mi}')


