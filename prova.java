// João Vitor Alves Fahning-20220005772 e Renan Gondim Dias de Albuquerque-20220070645

import java.util.Scanner;

public class prova {
    
    public static void main(String[] args){

        Scanner sc;
        int op=0;
        int k =0;
        int aux = 0;
        double midade=0; 
        double mpeso=0; 
        double maltura=0; 
        double mIMC = 0;
        double imc=0;
        double mv=0; 
        double mn=300;
        String[] nome = new String[5];
        String[] sobrenome = new String[5];
        String surname;
        double[] idade = new double[5];
        double[] peso =  new double[5];
        double[] altura = new double[5];

        do{
            System.out.println("\n[1] Cadastro das pessoas");
            System.out.println("\n[2] Lista de pessoas cadastradas");        
            System.out.println("\n[3] Análise da média");        
            System.out.println("\n[4] Valores do IMC");
            System.out.println("\n[5] Valores das idades");
            System.out.println("\n[6] Dado da pessoa");
            System.out.println("\n[7] Sair\n");
            System.out.println("Digite uma opção: ");
            sc = new Scanner(System.in);
            op=sc.nextInt();
            switch(op){

                case 1:
                       for(int i=0;i<5;i++){

                        System.out.println("Nome: ");
                        sc = new Scanner(System.in);
                        nome[i] = sc.next();
                        System.out.println("Sobrenome: ");
                        sc = new Scanner(System.in);
                        sobrenome[i] = sc.next();
                        do{
                            System.out.println("Idade: ");
                        sc = new Scanner(System.in);
                        idade[i] = sc.nextDouble();
                        if(idade[i]<16){

                            System.out.println("Digite uma idade maior que 16 anos");

                        }
                        } while(idade[i]<16);
                        
                        System.out.println("Peso: ");
                        sc = new Scanner(System.in);
                        peso[i] = sc.nextDouble();
                        System.out.println("Altura(Exemplo: 1,80): ");
                        sc = new Scanner(System.in);
                        altura[i] = sc.nextDouble();
                       } 
                       aux = 1;
                       
                       break;

                case 2:
                       if(aux!=0){

                            for(int i=0; i<5; i++){

                                System.out.println("Pessoa " + (i+1));
                                System.out.println("Nome: "+ nome[i] );
                                System.out.println("Sobrenome: "+ sobrenome[i] );
                                System.out.println("Idade:"+ idade[i] +" anos");
                                System.out.println("Peso: " + peso[i] + "kg");
                                System.out.println("Altura: " + altura[i] + "m");

                            }

                       } else{
                       
                        System.out.println("Não há pessoas cadastradas");

                       } break;
                case 3:
                        if(aux!=0){

                                   for(int i=0;i<5;i++){

                                        midade += idade[i];

                                   }
                                   for(int i=0;i<5;i++){

                                    mpeso += peso[i];

                               }
                               for(int i=0;i<5;i++){

                                maltura += altura[i];

                           }
                           for(int i=0;i<5;i++){

                                imc= peso[i]/(altura[i]*altura[i]);
                                mIMC = mIMC + imc;

                       }
                                midade= midade/5;
                                mpeso=mpeso/5;
                                maltura=maltura/5;
                                mIMC=mIMC/5;
                                System.out.println("A média de idade das pessoas lidas: " + midade);
                                System.out.println("A média dos pesos das pessoas lidas: " + mpeso);
                                System.out.println("A média das alturas das pessoas lidas: " + maltura);
                                System.out.println("A média do IMC das pessoas lidas: " + mIMC);
                        } else{

                        System.out.println("Não há pessoas cadastradas");

                        } break;
                case 4:
                        if(aux!=0){

                            for(int i=0;i<5;i++){
                                
                                System.out.print("Nome: " + nome[i]);
                                System.out.println(" Sobrenome: "+ sobrenome[i] );
                                imc= peso[i]/(altura[i]*altura[i]);
                                System.out.println("IMC: " + imc);
                                
                                if(imc<18.5){

                                    System.out.println("Abaixo do peso");
                                } else if(imc>18.5 && imc<25){

                                    System.out.println("Peso Ideal");

                                } else if(imc>=25 && imc<30){

                                    System.out.println("Levemente acima do peso");

                                } else if(imc>=30 && imc<35){

                                    System.out.println("Obesidade grau 1");

                                } else if(imc>=35 && imc<40){

                                    System.out.println("Obesidade grau 2");

                                } else if(imc>40){

                                    System.out.println("Obesidade grau 3");

                                }

                           }

                        } else{

                        System.out.println("Não há pessoas cadastradas");

                        } break;
                case 5:
                        if(aux!=0){

                            for(int i=0; i<5; i++){

                                System.out.println("Pessoa " + (i+1));
                                System.out.print("Nome: "+ nome[i]);
                                System.out.println(" Sobrenome: "+ sobrenome[i] );
                                System.out.println("Idade:"+ idade[i]); 
                            }
                            for(int i=0; i<5; i++){

                                if(mv<idade[i]){
                                    mv=idade[i];
                                }
                            }
                            for(int i=0; i<5; i++){

                                if(mn>idade[i]){
                                    mn=idade[i];
                                }
                            }
                            for(int i=0; i<5; i++){

                                if(mv==idade[i]){
                                    System.out.println("A pessoa mais velha é " + nome[i] + " " + sobrenome[i]);
                                }
                            }
                            for(int i=0; i<5; i++){

                                if(mn==idade[i]){
                                    System.out.println("A pessoa mais nova é " + nome[i] + " " + sobrenome[i]);
                                }
                            }       

                        } else{

                        System.out.println("Não há pessoas cadastradas");

                        } break;
                case 6:
                        if(aux!=0){

                            System.out.println("Digite um sobrenome cadastrado: ");
                            sc = new Scanner(System.in);
                            boolean igual = false;
                            surname = sc.next();
                            for(int i=0; i<5; i++){

                                igual = (surname.equalsIgnoreCase(sobrenome[i]));
                                if(igual==true){

                                    System.out.println("Nome: "+ nome[i] );
                                    System.out.println("Sobrenome: "+ sobrenome[i] );
                                    System.out.println("Idade:"+ idade[i]);
                                    System.out.println("Peso: " + peso[i]);
                                    System.out.println("Altura: " + altura[i]);
                                    imc= peso[i]/(altura[i]*altura[i]);
                                    System.out.println("IMC: " + imc);
                                    if(imc<18.5){

                                    System.out.println("Abaixo do peso");
                                    } else if(imc>18.5 && imc<25){

                                    System.out.println("Peso Ideal");

                                    } else if(imc>=25 && imc<30){

                                    System.out.println("Levemente acima do peso");

                                    } else if(imc>=30 && imc<35){

                                    System.out.println("Obesidade grau 1");

                                    } else if(imc>=35 && imc<40){

                                    System.out.println("Obesidade grau 2");

                                    } else if(imc>40){

                                    System.out.println("Obesidade grau 3");

                                }
                                
                                } 
                            }
                            if(igual==false){

                                    System.out.println("Não há essa pessoa cadastrada");
                                }
                            

                        } else{

                        System.out.println("Não há pessoas cadastradas");

                        } break;
                case 7:
                System.out.println("Usuário saiu do programa"); 
                k=1;
                break;
                        
                default:    
                        
                        System.out.println("O número escolhido é inválido");
                        break;
            }
        } while(k==0);
    } 
}

