package com.gatech.cs4400.AtlantaMovieService.search;

import com.gatech.cs4400.AtlantaMovieService.entity.Visit;
import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "theater.theaterId.company.name", params = "companyName", spec = LikeIgnoreCase.class),
        @Spec(path = "visitDate", params = {"visitedAfter", "visitedBefore"}, spec = Between.class)
})
public interface VisitHistorySpec extends Specification<Visit> {
}
