package assignment2.java;


		class saranya{
			void qckSrt()
			{
			    int [] qs = {98,56,34,3,24,22,10 };
			    for (int i=0; i<qs.length; i++)
			    {

			        for (int j=qs.length-1; j>=0&&j>i; j--)
			        {
			            if (qs[i] > qs[j])
			            {
			                int temp = qs[i];
			                qs[i]= qs[j];
			                qs[j]= temp;
			         

			            }

			        
			        }
			    }

			    for (int a : qs)
			    {
			        System.out.print(a + " ");

			    }
			    System.out.println("  ");
			}
			}
		 public class quicksort{
				public static void main(String[] args) {
					saranya n=new saranya();
					n.qckSrt();
					
					
				}

			 }

	
