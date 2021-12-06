package principal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class criaTela extends JFrame{
  public criaTela(){
  }
  //criando tela jogar
  public void jogar(){
    //@@@@ INSTANCIANDO OBJETOS @@@@
    //instanciando a tela
    JFrame janela = new JFrame();
    //instanciando imagens
    /*
    ImageIcon blacktop = new ImageIcon(getClass().getResource("blackiep.jpeg"));
    JLabel bltop = new JLabel(blacktop);
    */
    //intanciando JButtons
    JButton joga = new JButton("JOGAR");
    JButton atualiza = new JButton("Atualizar dados");
    JButton credits = new JButton("Creditos");
    //instanciando JLabels
    JLabel title = new JLabel("BLACKJACK");
    //instanciando as fontes de texto
    Font gr = new Font("Arial",Font.PLAIN,15);
    Font giga = new Font("Arial",Font.PLAIN,120);
    title.setFont(giga);
    //@@@@ DEFININDO BOUNDS @@@@
    //JButtons Bounds
    joga.setBounds(550,260,150,60);
    atualiza.setBounds(550,360,150,60);
    credits.setBounds(1050,460,100,40);
    //JLabel Bounds
    title.setBounds(300,30,700,140);
    //adicionando elementos da tela
    janela.add(joga);
    janela.add(atualiza);
    janela.add(title);
    janela.add(credits);
    //definindo parametros da tela
    janela.setSize(1280, 720);
    janela.setLayout(null);
    janela.setTitle("Jogo de cartas 21");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
  }
  // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  // tela de cadastro de usuário
  public void cadastro(){
    //@@@@ INSTANCIANDO OBJETOS @@@@
    //instanciando a tela
    JFrame cadastro = new JFrame();
    //instanciando as caixas de texto
    JTextField usuario = new JTextField(30);
    JTextField senha = new JTextField(10);
    JTextField confsen = new JTextField(10);
    //instanciando botao de confirmação
    JButton confirma = new JButton("Cadastrar");
    //instanciando os titulos das caixas de texto
    JLabel user1 = new JLabel("Insira um usuario:");
    JLabel sen1 = new JLabel("Insira uma senha:");
    JLabel csen1 = new JLabel("Confirme a senha:");
    Font gr = new Font("Arial",Font.PLAIN,9);
    
    //@@@@ DEFININDO BOUNDS @@@@
    //definindo bounds pras JTextField
    usuario.setBounds(485,100,300,30);
    senha.setBounds(485,200,300,30);
    confsen.setBounds(485,300,300,30);
    //definindo bounds pros JButtons
    confirma.setBounds(525,400,200,40);
    //defininfo bounds pros JLabels
    user1.setBounds(485,60,200,30);
    sen1.setBounds(485,160,200,30);
    csen1.setBounds(485,260,200,30);
    //@@@@ CONFIRMANDO O APERTAR DO BOTÃO @@@@ !!!---> NÃO ESTÁ FUNCIONAL <---!!!
    confirma.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(e.getSource()==confirma){
          criaTela ct = new criaTela();
          //recebendo o novo conteudo das caixas de texto apos o botão ser apertado
          String usu,sen,csen;
          usu = usuario.getText();
          sen = senha.getText();
          csen = confsen.getText();
          //impressão no sistema pra analise dos dados antes de reapertar o botão
          System.out.println("pré condição de erro\nnome: "+usu+"\nsenha: "+sen+"\nconf: "+csen);
          //impressão sob a condição de dados corretos depois de reapertar o botão
          if(sen.equals(csen)){
            System.out.println("---- Deu certo ----\nnome: "+usu+"\nsenha: "+sen+"\nconfirmação: "+csen);
          }
          //impressão sob a condição de dados errados depois de reapertar o botão
          if(sen != csen){
            System.out.println("ERRO: senhas diferentes");
            ct.cadastro();
          }
        }  
      }
    });
    //adicionando elementos da tela
    cadastro.add(usuario);
    cadastro.add(senha);
    cadastro.add(confsen);
    cadastro.add(confirma);
    cadastro.add(user1);
    cadastro.add(sen1);
    cadastro.add(csen1);
    //criando a tela
    cadastro.setTitle("CADASTRE-SE");
    cadastro.setSize(1280,720);
    cadastro.setLayout(null);
    cadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);
    cadastro.setVisible(true);
  }
  //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  // tela atualizar 
  public void atualizar(){
    //@@@@ INSTANCIANDO OBJETOS @@@@  
    //instanciando a tela
    JFrame atualiza = new JFrame();
    //instanciando as JLabels
    JLabel title = new JLabel("ATUALIZAÇÃO\n DE DADOS ");
    JLabel user = new JLabel("Novo usuário:");
    JLabel pass = new JLabel("Nova senha:");
    JLabel cpass = new JLabel("Confirme a senha:");
    //instanciando JButton
    JButton confirma = new JButton("Confirmar");
    //instanciando as JTextField
    JTextField usuario = new JTextField();
    JTextField senha = new JTextField();
    JTextField csenha = new JTextField();
    //instanciando as FONTES de texto
    Font gr = new Font("Arial",Font.PLAIN,15);
    Font giga = new Font("Arial",Font.PLAIN,50);
    title.setFont(giga);
    user.setFont(gr);
    pass.setFont(gr);
    cpass.setFont(gr);
    //@@@@ DEFININDO BOUNDS @@@@
    //Bounds JTextFields
    usuario.setBounds(485,200,300,30);
    senha.setBounds(485,260,300,30);
    csenha.setBounds(485,320,300,30);
    //Bounds JLabels
    user.setBounds(485,170,200,30);
    pass.setBounds(485,230,200,30);
    cpass.setBounds(485,290,200,30);
    title.setBounds(300,30,700,140);
    //Bounds JButtons
    confirma.setBounds(525,400,200,40);
    //adicionando elementos a tela
    atualiza.add(usuario);
    atualiza.add(senha);
    atualiza.add(csenha);
    atualiza.add(user);
    atualiza.add(pass);
    atualiza.add(cpass);
    atualiza.add(confirma);
    atualiza.add(title);
    //criando a tela
    atualiza.setSize(1280, 720);
    atualiza.setLayout(null);
    atualiza.setTitle("Atualização de dados");
    atualiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    atualiza.setVisible(true);
    
  }
  //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  //metodo que cria tela de login
  public void login(){
    //@@@@ INSTANCIANDO OBJETOS @@@@
    //instanciando a tela
    JFrame login = new JFrame();
    //INSTANCIANDO IMAGENS
    //rei
    ImageIcon imgRei = new ImageIcon(getClass().getResource("cartaRei.png"));
    JLabel rei = new JLabel(imgRei);
    //RAINHA
    ImageIcon imgRainha = new ImageIcon(getClass().getResource("cartaQCopas.jpg"));
    JLabel rainha = new JLabel(imgRainha);
    //instanciando JLabels
    JLabel title = new JLabel("BLACKJACK");
    JLabel user = new JLabel("Insira seu usuario:");
    JLabel pass = new JLabel("Insira sua senha:");
    //instanciando JButtons
    JButton entra = new JButton("Entrar");
    JButton cadastrar = new JButton("Cadastrar");
    //instanciando JTextFields
    JTextField usuario = new JTextField();
    JTextField senha = new JTextField();
    //instanciando as fontes de texto
    Font gr = new Font("Arial",Font.PLAIN,15);
    Font giga = new Font("Arial",Font.PLAIN,120);
    user.setFont(gr);
    pass.setFont(gr);
    title.setFont(giga);
    //@@@@ DEFININDO BOUNDS @@@@
    //JTextFields Bounds
    usuario.setBounds(485,200,300,30);
    senha.setBounds(485,300,300,30);
    //JButtons Bounds
    entra.setBounds(525,350,200,40);
    cadastrar.setBounds(525,400,200,40);
    //JLabel Bounds
    user.setBounds(485,170,200,30);
    pass.setBounds(485,270,200,30);
    title.setBounds(300,30,700,140);
    //Image Bounds
    rei.setBounds(20,30,280,450);
    rainha.setBounds(990,30,270,450);
    //adicionando elementos a tela
    login.add(usuario);
    login.add(senha);
    login.add(entra);
    login.add(cadastrar);
    login.add(user);
    login.add(pass);
    login.add(title);
    login.add(rei);
    login.add(rainha);
    //criando a tela
    login.setTitle("LOGIN");
    login.setSize(1280,720);
    login.setLayout(null);
    login.setDefaultCloseOperation(EXIT_ON_CLOSE);
    login.setVisible(true);
  }
  public void credito(){
    //@@@@ INSTANCIAR OBJETOS @@@@
    //instanciando a tela
    JFrame credito = new JFrame();
    //instanciando Jlabels
    JLabel ale = new JLabel("XANDÃO");
    JLabel vit = new JLabel("VITÃO");
    JLabel raf = new JLabel("RAFÃO");
    JLabel cred = new JLabel("CRÉDITOS");
    //instanciando as fontes de texto
    Font gr = new Font("SansSerif",Font.BOLD,25);
    Font giga = new Font("SansSerif",Font.PLAIN,60);
    ale.setFont(gr);
    vit.setFont(gr);
    raf.setFont(gr);
    cred.setFont(giga);
    //instanciando imagens
    ImageIcon xand = new ImageIcon(getClass().getResource("alexandre.jpeg"));
    JLabel alexandre = new JLabel(xand);
    /*
    ImageIcon vict = new ImageIcon(getClass().getResource("victor.png"));
    JLabel victor = new JLabel(xand);
    ImageIcon raff = new ImageIcon(getClass().getResource("rafael.png"));
    JLabel rafael = new JLabel(raff);
    */
    //@@@@ DEFININDO BOUNDS @@@@
    //Bounds de JLabel
    ale.setBounds(590,460,150,40);
    vit.setBounds(140,460,100,40);
    raf.setBounds(1000,460,100,40);
    cred.setBounds(470,10,700,60);
    //Bounds de ImageIcons
    alexandre.setBounds(100,90,200,360);
    //adicionando elementos a tela
    credito.add(ale);
    credito.add(vit);
    credito.add(raf);
    credito.add(cred);
    credito.add(alexandre);
    //criando a tela
    credito.setTitle("Créditos");
    credito.setSize(1280,720);
    credito.setLayout(null);
    credito.setDefaultCloseOperation(EXIT_ON_CLOSE);
    credito.setVisible(true);
  }
}