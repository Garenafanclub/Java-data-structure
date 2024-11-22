 class LazyThread extends Thread
        {
          public void run()
             {
               System.out.println(" Some has started me !! ");
               System.out.println(" Don't disturb m , sleeping... ");
               try
                  {
                    Thread.sleep(8000);
                    System.out.println("  Feeling Fresh ...");
                  }catch(InterruptedException e)
                      { System.out.println(" Lazy is disturbed");}
               }
         }
    class Interruptor {
        public static void main(String args[]) {
            System.out.println(" Starting a Lazy Thread");
            LazyThread th = new LazyThread();
            System.out.println(" giving lazy 5 second to complete ");
            th.start();
            try {
                th.join(4000);
            } catch (Exception e) {
            }
            if (th.isAlive()) {
                System.out.println(" Lazy is taking too much time to complete...interrupting it");
                th.interrupt();
            }
        }
    }
      //   }      class Clerk extends Thread
      //      {  String name; int cycle;
      //          public Clerk(String nm,int cycle )
      //              {  name=nm;  this.cycle=cycle; }
      //           public void run()  
      //            {
      //               for(int i=1;i<cycle;i++)
      //                  {
      //               System.out.println(  "m working " +  name + "   " + i);
      //             try {  Thread.sleep(1000); } catch(Exception e) {}
      //                  }
      //            }
      //      }     
      // class Manager
      //     {
      //           public static void main(String args[]) throws Exception
      //             {
      //               Clerk c1=new Clerk("Mohan",5); c1.start();
      //               Clerk c2=new Clerk("Rohan",10);  c2.start();
      //               Clerk c3=new Clerk("Sohan",5);   c3.start();
      //               for(int i=1;i<10;i++)
      //                  {
      //                      System.out.println(  "m working manager " + i);
      //                      Thread.sleep(100);
      //                  }
      //          c1.join();  c3.join(); 
      //             System.out.println( " M going : manager");                    
      //             }
      //    }
