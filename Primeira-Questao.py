import os # Importando o módulo para trabalhar com o sistema operacional
import time # Importando o módulo de tempo
from multiprocessing import Process

def openExplorer(): # Criando uma função que utiliza o sistema operacional para abrir o explorer
  os.startfile('C:\Program Files (x86)\Internet Explorer\iexplore.exe')
  time.sleep(1) # Dando um tempo para o explorer abrir
  
if __name__ == '__main__':
    print("Iniciando o processo")
    p = Process(target=openExplorer) # Instância o processo
    p.start() # Iniciando o processo
    p.join() # Esperando o processo terminar
    print("Finalizando o processo")