package com.github.hcsp.controlflow;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import java.util.stream.IntStream;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        IntStream.range(0, 100)
                .filter(Primes::isPrime)
                .forEach(i -> capture.expect(containsString("" + i)));
        Main.printPrimeNumbers();
    }
}
