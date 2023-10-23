package Modelo;

/**
 *
 * @author Jordán Osorio
 */

public abstract class Local {

    private int idLocal;
    
    public Local(){  
    }

    public Local(int idLocal){
        this.idLocal = idLocal;
    }

    public int getIdlocal(){
        return idLocal;
    }

    public void setIdlocal(int idLocal){
        this.idLocal = idLocal;
    }

    public String print(){
        return "Local : " + "idLocal"+ idLocal;
    }



    
}
