y = 2.5
r = 3.14
address = 0x0000aaf8

-- string: Textos
endereco = "Av Maracanã, 255"
tel = "(21) 1234-5678"

--table: Tabelas -> tipo de dados estruturado
pessoa = {}
pessoa.nome = "leo"
pessoa.idade = 33

pessoa = {
	nome = "Raul",
	idade = "32",
	endereco = "Rua Borges, 123"

}
pares =  {0, 2, 4, 6, 8, 10}

-- function: Funções
function soma(a, b)
	return a + b
end

s = soma

print(s(1, 2))

--thead: corrotinas

--userdata: Tipo customizados definidos pelo usuario (em C)
