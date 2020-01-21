/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.gov.anar.dck.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @author HPardess 2019
 */
// @Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
// @ToString(exclude="form")
// @EqualsAndHashCode
@Entity(name = "Report")
@Table(name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_generator")
    @SequenceGenerator(name = "report_generator", sequenceName = "report_seq", allocationSize = 1)
    @Column(unique = true, updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "env_slug")
	private String envSlug;
  
    @Column(name = "xml_content")
    @Type(type = "text")
    private String xmlContent;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne
	@JoinColumn(name = "form_id", nullable = true)
	@JsonIgnore
	private Form form;

    public Report(String name, String description) {
            this.name = name;
            this.description = description;
    }

    public Report(Long id, String name, String description, String envSlug, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.envSlug = envSlug;
        this.createdAt = createdAt;
    }

    @Override
	public String toString() {
        return "Report [id=" + id + ", name=" + name + ", description=" + description + ", envSlug=" + envSlug + ", created_at=" + createdAt  + "]";
	}
}
