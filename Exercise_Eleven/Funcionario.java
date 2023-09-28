 package Exercise_Eleven;

 public  class Funcionario {
        private String nome;
        private  String inscrições;
        private double salario;
        private String turno;


        public Funcionario(String nome, String inscrições, double salario , String turno) {
            this.nome = nome;
            this.inscrições = inscrições;
            this.salario = salario;
            this.turno =turno;
        }


        
        public String getNome() {
            return this.nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getInscrições() {
            return this.inscrições;
        }


        public void setInscrições(String inscrições) {
            this.inscrições = inscrições;
        }


        public double getSalario() {
            return this.salario;
        }


        public void setSalario(double salario) {
            this.salario = salario;
        }


        public String getTurno() {
            return this.turno;
        }


        public void setTurno(String turno) {
            this.turno = turno;
        }


        public  String horariosDisponiveis();
        public  String horarioTrabalho();
        public  String informaçõesFuncionarios();
        public  String funçãoDesempenhar();


    
}