package guru.springframework.msscbreweryclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by michael on 2021-12-14.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerDto {
    private UUID id;
    private String name;

}
