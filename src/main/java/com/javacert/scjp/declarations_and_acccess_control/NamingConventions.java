package com.javacert.scjp.declarations_and_acccess_control;

public class NamingConventions {
    
    private int _a;
    private int $c;
    private int ______2_w;
    private int _$;
    private int this_is_a_very_detailed_name_for_an_identifier;
    
    private class $____MyClass {
        private String $ = "crazy_prop_value";

        public String get$() {
            return $;
        }

        public void set$(String $) {
            this.$ = $;
        }
        
    }
    
    public static void main(String... args){
        
        NamingConventions nc = new NamingConventions();
        $____MyClass c = nc.new $____MyClass();
        System.out.println(c.get$());
    }

}
