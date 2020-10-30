package secondStage;

import java.util.List;

/**
 * 문자열 계산
 */
public class StringCalculator {

    /**
     * 연산
     */
    public static int calculator(String str) {
        String[] values = StringUtil.split(str);
        List<Integer> operands = new Operand(values).getOperands();   // 피연산자
        List<String> operators = new Operator(values).getOperators(); // 연산자

        return new Operate(operands, operators).getResult(); // 연산 결과
    }
}
