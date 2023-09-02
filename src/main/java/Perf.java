
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Perf{

    MetricRegistry metricRegistry;
    
    public Object measureMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        Object retval = pjp.proceed();
        long end = System.nanoTime();
      //imagine if from here we could create tags and metrics
      //from method name and some other context
      // LIKE THings in the request scope
      // or our tracing dB
      // THEN WE COYLD INJECT TVIS IN AT RUNTIME
      // conditionally
        String methodName = pjp.getSignature().getName();
        return retval;
    }

}
