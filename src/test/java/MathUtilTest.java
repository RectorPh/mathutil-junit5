import com.thienpham.mathutil.core.MathUtil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;


public class MathUtilTest {
    
    public MathUtilTest() {
        
        @Test
        public void testFactorialGivenWrongArgThrowException(){
            //function nhan 2 tham so
            //1 la object co code implement
//            //2 function interface ten la executable
//            Executable excObj = new Executable() {
//                @Override
//                public void execute() throws Throwable {
//                    MathUtil.getFactorial(-5);
//                }
//            };
            assertThrows(IllegalArgumentException.class,
                    () -> MathUtil.getFactorial(-5));
        }
//        
    }
    
}
