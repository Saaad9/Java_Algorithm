import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;
        int count = 0;
        String st = br.readLine();
        // ljes=njak
        for(int i=0; i < st.length(); i++){ 
            ch = st.charAt(i);
            if(i < st.length()-1 && ch == 'c'){
                
                if( st.charAt(i+1) == '=') i++;

                else if(st.charAt(i+1) == '-' ) i++;
            }

            else if( i < st.length()-1 && ch == 'd'){

                if(i < st.length()-2 && st.charAt(i+1) == 'z'){
                
                    if(st.charAt(i+2) == '='){
                        i+=2;
                    }
                }

                else if( st.charAt(i+1) == '-'){
                    i++;
                }
            }

            else if(i < st.length()-1 &&  ch == 'l'){
                if(st.charAt(i+1) == 'j') i++;
            }

            else if( i < st.length()-1 && ch == 'n'){
                if( st.charAt(i+1) == 'j') i++;
            }

            else if( i < st.length()-1 && ch == 's'){
                if( st.charAt(i+1) == '=') i++;
            }

            else if( i < st.length()-1 && ch == 'z'){
                if( st.charAt(i+1) == '=') i++;
            }

            count++;
        }
        System.out.print(count);
    }
}